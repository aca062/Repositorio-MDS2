import { LitElement, html, css, customElement } from 'lit-element';
import './vista-ultimos_exitos';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
 <vista-ultimos_exitos style="flex-shrink: 0; flex-grow: 0;"></vista-ultimos_exitos>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
