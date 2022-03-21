import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-artistas_similares')
export class VistaArtistas_similares extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h1 id="h1">Heading 1</h1>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="height: 100%;"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
