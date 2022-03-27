import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_cibernauta';
import './vista-ultimos_exitos';

@customElement('vista-cibernauta')
export class VistaCibernauta extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; justify-content: space-between; height: 100%;" id="vaadinVerticalLayout">
 <vista-cabecera_cibernauta style="width: 100%;"></vista-cabecera_cibernauta>
 <vista-ultimos_exitos style="flex-shrink: 0; flex-grow: 0; height: 100%;" id="vistaUltimos_exitos"></vista-ultimos_exitos>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
